package org.EffectiveJava.Chapter3.item10a11;


// Item 10: Obey the general contract when overriding equals


public class ItemTenTest {
    public static void main(String[] args) {

        // Part1

//		// integer-type
//		System.out.println(10 == 20);
//		// char-type
//		System.out.println('a' == 'b');
//		// char and double type
//		System.out.println('a' == 97.0);
//		// boolean type
//		System.out.println(true == true);
//
//		System.out.println((int) 'a'); // cast char to int
//		System.out.println('a' == 97); // char is automatically promoted to int
//		System.out.println('a' + 1); // char is automatically promoted to int
//		System.out.println((char) 98); // cast int to char
//
//		DummyClass d = new DummyClass(1, 2);
//		DummyClass d2 = new DummyClass(1, 2);
//		System.out.println(d == d2);
//		System.out.println(d.equals(d));
//


        // Part2

//        DummyClass deneme = new DummyClass(10, 11);
//        DummyClass deneme2 = new DummyClass(10, 11);
//
//        if (deneme.equals(deneme2))
//        	System.out.println("We are equal");
//        else
//        	System.out.println("We are NOT equal");


        // Part3
//        DummyClassOverrided deneme3 = new DummyClassOverrided(10, 11);
//        DummyClassOverrided deneme4 = new DummyClassOverrided(10, 11);
//
//        if (deneme3.equals(deneme4))
//        	System.out.println("We are equal");
//        else
//        	System.out.println("We are NOT equal");
//
//        System.out.println(deneme4.equals(deneme3));
//        System.out.println(deneme3.equals(null));
//



        // Part4
		/*
		reflexive: an object must equal itself x.equals(x)
		symmetric: x.equals(y) must return the same result as y.equals(x)
		transitive: if x.equals(y) and y.equals(z) then also x.equals(z)
		consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)
		null control a.equals(null)
		*/


        // Part 5 trs.




        // part 6

//		List<DummyClassOverrided> list = new ArrayList<>();
//		DummyClassOverrided e = new DummyClassOverrided(1, 2);
//		list.add(e);
//		System.out.println(list.contains(new DummyClassOverrided(1, 2)));
//
//
//		List<DummyClass> list2 = new ArrayList<>();
//		DummyClass r = new DummyClass(3, 4);
//		list2.add(r);
//		System.out.println(list2.contains(new DummyClass(3, 4)));





        // Part7

//		DummyClassOverrided trial1 = new DummyClassOverrided(1, 2);
//		DummyClassOverrided trial2 = new DummyClassOverrided(3, 4);
//		DummyClassOverrided trial3 = new DummyClassOverrided(1, 2);
//		System.out.println(trial1.hashCode());
//		System.out.println(trial2.hashCode());
//		System.out.println(trial3.hashCode());


        // Part7
//		Map<DummyClassOverrided, String> m = new HashMap<>();
//		m.put(new DummyClassOverrided(1, 2), "FirstMember");
//
//
//		System.out.println(m.get(new DummyClassOverrided(1, 2)));


    }
}
