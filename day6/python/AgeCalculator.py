from datetime import datetime

def age_calculator(birth_date_day):
  birth_date = datetime.strptime(birth_date_day, "%d-%m-%Y")
  today = datetime.today()
  age = today.year - birth_date.year
  return age

if __name__ == "__main__":
 
  birth_date_day = input("Enter your birth date : ")
  age = age_calculator(birth_date_day)
  print(age)

