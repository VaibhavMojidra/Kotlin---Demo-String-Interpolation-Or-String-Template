fun main(args: Array<String>) {
	var name: String = "Vaibhav Mojidra"

	println("Name  - $name")  // Using template with variable name

	println("Name length - ${name.length}")  // Using template with expression.
	var n1: Int = 23
	var n2: Int = 2
	println("$n1+$n2=${n1 + n2}")
}