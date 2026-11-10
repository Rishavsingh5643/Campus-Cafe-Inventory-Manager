1. Warmup.java

My Prediction :-
a = 7
d = 5.0
b = -2 ,
two
three

My logic for b value:

int N(130) in bits :
1 0 0 0 0 0 1 0

byte b in bits:
1 0 0 0 0 0 1 0

since, rightmost bit signifies sign so number
will be negative.
value = -2

Output

7 5.0 -126
Two
Three

---

2. What is the difference between the static variable totalProducts and the instance variable name?

static variable is a class variable whose data is shared by all the objects.
while instance varible is an object variable whose data is for that particular object only.

---

3. What does the copy constructor do, and why does changing p2.name not change p1.name?

The copy constructor creates the duplicate object using the refernce of another object.
the p1.name doesnot change p2.name because the
copy constructor here creates shallow copy which
means all the variable name and data will be same
for two different object.

As p1 and p2 are different object so they are not changed by changing other.

---

4. Why does Java force you to write (int) average when converting a double to an int, and what happens to the decimal part?

So this is the case of narrowing when you have to go from biger datatype to lower datatype you have to explicitly typecast the value considering the fact the data can be changed.

the fractional part is discared.
