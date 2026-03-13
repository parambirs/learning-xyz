hometown = "Salt Lake City, Utah"

print(hometown.lower()) # salt lake city, utah
print(hometown.upper()) # SALT LAKE CITY, UTAH

print(hometown.replace("Salt", "Blue")) # Blue Lake City, Utah
print(hometown.replace("lt", "lty"))    # Salty Lake City, Utah

# All instances are replaced
print("New York, New York".replace("New", "Old"))   # Old York, Old York

print(len(hometown))        # 20
print(hometown.index("Lake"))   # 5
print(hometown.split())     # ['Salt', 'Lake', 'City,', 'Utah']
print(hometown.swapcase())  # sALT lAKE cITY, uTAH
