package com.question07;
import java.util.Comparator;

public class Question7AgeComp implements Comparator<Question7Employees>
{
	@Override
	public int compare(Question7Employees e1, Question7Employees e2)
	{
		return e1.getAge() - e2.getAge();
	}
}
