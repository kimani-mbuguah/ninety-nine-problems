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