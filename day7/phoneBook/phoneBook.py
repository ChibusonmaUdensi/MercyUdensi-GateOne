
contacts = []

def add_contact():
  """
 
  """
  print("Enter first name: ")
  first_name = input()
  print("Enter last name: ")
  last_name = input()
  print("Enter phone number: ")
  phone_number = input()
  contact = Contact(first_name, last_name, phone_number)
  contacts.append(contact)
  return contact

def remove_contact():
  """
    """
  print("Enter contact to delete: ")
  name_to_delete = input()
  for i, contact in enumerate(contacts):
    if contact.first_name == name_to_delete or contact.last_name == name_to_delete:
      del contacts[i]
      print("Contact deleted")
      return