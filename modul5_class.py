from userService import userService

print("System Login kelompok 03!\n")
email = input("Email: ")
password = input("Password: ")
get_class = userService(email,password)
get_class.login()