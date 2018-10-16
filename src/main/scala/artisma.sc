var capital = Map("Kenya"->"Nairobi","Tanzania"->"Darelsalam")
capital += ("somalia"->"mogadishu")

capital
println(capital("Kenya"))


def factorial(x:BigInt):BigInt = {
  if(x == 0)1
  else {
    x * factorial(x-1)
  }
}

factorial(30)

//max between two numbers
def max(x:Int, y: Int) :Int = {
  if (x>y)x
  else y
}

max(22,3)
max(6,9)

def greet() = println("Hello World")
greet()