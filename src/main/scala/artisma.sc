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

//grading system

def grading(x:String, y:Int) = {
  println("Hello " + x + "\n Here is your score this term")
  if (y <= 40){
    println("You've failed. You scored an E(" + y + ").\nPlease take supplementary exams")
  }else if (y > 40 && y < 50){
    println("You scored a D(" + y + "). This is bad")
  }else if (y > 49 && y < 60){
    println("You scored a C(" + y + "). You are not there yet")
  }else if(y > 59 && y < 70){
    println("Good. But not good enough. You scored a B(" + y + "). Awesome")
  }else{
    println("Perfecto. You made it. You scored an A(" + y + "). Way to go")
  }
}

grading("Kimani Mbugua",89)