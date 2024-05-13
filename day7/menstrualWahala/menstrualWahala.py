from datetime import datetime

def main():
	print("MENSTRUAL WAHALA")
	lmp= input("First Date of Last Menstrual Period")
	cycle_length = input("Cycle Length(dd/mm/yyyy)")

	lmp = datetime.datetime(lmp, "%d/%m/%Y")
	cycle = int(cycle_length)
	estimated_ovulation = cycle - 14
	 
	ovulation_day = datetime.timedelta(days = estimated_ovulation)
	ovulation_date = lmp + ovulation_day
	print("Ovulation Date" + ovulation_date.strftime("%d/%m/%Y"))

