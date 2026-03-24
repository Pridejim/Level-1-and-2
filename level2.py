name = input("Member Name: ")
id_no = input("Member ID: ")
contributions = []

for i in range(6):
    val = input(f"Month {i+1} Contribution: ")
    contributions.append(float(val))

total = sum(contributions)
print(f"Total Savings for {name}: KES {total}")

