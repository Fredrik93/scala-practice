trait Validation:
  def isValid(input: String): Boolean
  def validate (input: String): String =
    if isValid(input) then "Valid"  else "Invalid"

class NonEmptyValidator extends Validation:

  def isValid(input: String): Boolean = input.trim.nonEmpty

class LengthValidator extends Validation:
  
  def isValid(input: String): Boolean = input.length > 5
