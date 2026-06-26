trait Validation:
  def isValid(input: Boolean): Boolean
  def validate (input: String): String = {
    "Valid but this needs more work"
  }