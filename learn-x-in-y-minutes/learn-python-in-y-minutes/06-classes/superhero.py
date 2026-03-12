from human import Human

class Superhero(Human):

	species = "Superhuman"

	def __init__(self, name, movie=False, superpowers=["super strength", "bulletproofing"]):
		self.fictional = True
		self.movie = movie
		self.superpowers = superpowers

		super().__init__(name)

	def sing(self):
		return "Dun, dun, DUN!"

	def boast(self):
		for power in self.superpowers:
			print("I wield the power of {pow}!".format(pow=power))
