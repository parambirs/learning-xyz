package funsets

import org.scalatest.FunSuite


import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class FunSetSuite extends FunSuite {

  /**
   * Link to the scaladoc - very clear and detailed tutorial of FunSuite
   *
   * http://doc.scalatest.org/1.9.1/index.html#org.scalatest.FunSuite
   *
   * Operators
   *  - test
   *  - ignore
   *  - pending
   */

  /**
   * Tests are written using the "test" operator and the "assert" method.
   */
   test("string take") {
     val message = "hello, world"
     assert(message.take(5) == "hello")
   }

  /**
   * For ScalaTest tests, there exists a special equality operator "===" that
   * can be used inside "assert". If the assertion fails, the two values will
   * be printed in the error message. Otherwise, when using "==", the test
   * error message will only say "assertion failed", without showing the values.
   *
   * Try it out! Change the values so that the assertion fails, and look at the
   * error message.
   */
   test("adding ints") {
     assert(1 + 2 === 3)
   }


  import FunSets._

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }

  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   *
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   *
   *   val s1 = singletonSet(1)
   *
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   *
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   *
   */

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
    val s1020: Set = (x: Int) => x >= 10 && x <= 20
    val s1525: Set = (x: Int) => x >= 15 && x <= 25
  }

  /**
   * This test is currently disabled (by using "ignore") because the method
   * "singletonSet" is not yet implemented and the test would fail.
   *
   * Once you finish your implementation of "singletonSet", exchange the
   * function "ignore" by "test".
   */
  test("singletonSet(1) contains 1") {

    /**
     * We create a new instance of the "TestSets" trait, this gives us access
     * to the values "s1" to "s3".
     */
    new TestSets {
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton")
    }
  }

  test("union contains all elements of each set") {
    new TestSets {
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
    }
  }

  test("intersection contains common elements between two sets") {
    new TestSets {
      val i = intersect(s1020, s1525)
      assert(contains(i, 15))
      assert(contains(i, 20))
      assert(!contains(i, 21))
      assert(!contains(i, 14))
    }
  }

  test("diff contains elements from first set that are not present in second set") {
    new TestSets {
      val d = diff(s1020, s1525)
      assert(contains(d, 10))
      assert(contains(d, 14))
      assert(!contains(d, 15))
      assert(!contains(d, 20))
    }
  }

  test("filter contains the correct subset of elements") {
    val base: Set = (i: Int) => i >= 1 && i <= 20
    val filtered = filter(base, i => i % 2 == 0)
    assert(!contains(filtered, 1))
    assert(contains(filtered, 2))
    assert(!contains(filtered, 19))
    assert(contains(filtered, 20))
  }

  test("forall works") {
    val base: Set = (i: Int) => i % 2 == 0
    assert(forall(base, i => i % 2 == 0))
    assert(!forall(base, i => i % 3 == 0))
  }

  test("exists works") {
    val base: Set = (i: Int) => i % 2 == 0
    assert(exists(base, i => i == 16))
    assert(!exists(base, i => i == 17))
    assert(exists(base, i => i % 4 == 0))
  }

  test("map works") {
    val even: Set = (i: Int) => i % 2 == 0
    val odd: Set = map(even, i => i + 1)
    assert(contains(odd, 3))
    assert(!contains(odd, 2))

    val base: Set = (i: Int) => i >= 1 && i <= 5
    val squared = map(base, i => i * i)
    assert(contains(squared, 4))

    val q = (i: Int) => List(1, 3, 4, 5, 7, 1000).contains(i)
    val qq = map(q, i => i - 1)
    printSet(q)
    printSet(qq)
  }
}
