<h1>Decorator Pattern</h1>
Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with some color without alter shape class.

<h2>Implementation</h2>
We're going to create a Pizza interface and concrete classes implementing the Pizza interface. 
We will then create an abstract decorator class Toping Decorator implementing the Pizza interface and having Pizza object as its instance variable.

Cheese is concrete class implementing Toping Decorator.

DecoratorPattern, our demo class will use Cheese to decorate Pizza objects.

![Image 2022-11-24 at 03 21](https://user-images.githubusercontent.com/79799727/203715573-85d638f3-57eb-43a3-819e-8419f07bceda.jpg)
