# Last updated: 7/28/2025, 6:15:29 PM
class Solution:
    def reverse(self, number: int) -> int:
      string = str(number)
      string = string[::-1]
      if number >0 :
          if int(string)>2147483647 :
           return 0 
      neg = "-"
      if number < 0 :
         string = "".join(neg+string)
         string = string[0:len(string)-1]
         if int(string) < -2147483648:
             return 0 
      return int(string)
        