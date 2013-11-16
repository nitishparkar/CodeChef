t = int(raw_input())

while t > 0:
  n = int(raw_input())
  song_lengths = map(int, raw_input().strip().split(" "))
  k = int(raw_input())
  uncle_johny_length = song_lengths[k-1]
  new_position = 1
  for x in song_lengths:
    if x < uncle_johny_length:
      new_position += 1
  print new_position
  t -= 1

