
function Person(name, gender) {
  let notAClosure = 20;
  let closure = 5;
  this.getName = function() {
    return name;
  }

  this.setName = function(newName) {
    name = newName;
  }

  this.getGender = function() {
    return gender;
  }

  this.setGender = function(newGender) {
    gender = newGender;
  }

  this.getClosure = function() {
    return closure;
  }

  this.setClosure = function(newClosureValue) {
    closure = newClosureValue;
  }
}


let outer = function() {
	let encapsulated = 5;
	return {
    fun: function(newValue) {
		if(newValue) {
			encapsulated = newValue
        } else {
			return encapsulated;
        }
    }
  }
}