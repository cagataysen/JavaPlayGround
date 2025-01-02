package org.EffectiveJava.Chapter4.item24;

public class TestDrive {

    public static void main(String[] args) {


		/*
		 * statik olan iç içe geçmiş sınıflar (static nested classes)
		   statik olmayan iç içe geçmiş sınıflar (non-static nested classes)
		   yerel sınıflar (local classes)
		   anonim sınıflar (anonymous classes)
		 *
		 */


//		// Static Nested
//		StaticNested.staticNestedClass nesne = new StaticNested.staticNestedClass();
//			// Calculator.Operation.SUM
//			// Builders...
//
//
//		// Non Static Nested
//			// Open for a memory leak..
//
//		NonStaticNested nonStatic = new NonStaticNested();
//		NonStaticNested.NonStaticNestedClass object2 = nonStatic.new NonStaticNestedClass();
//		object2.writeThis();

        // Local classes
        LocalClass lc = new LocalClass();


        // Anonim
        SuperClass sc = new SuperClass() {
            @Override
            public void writeMe() {
                System.out.println("anonim");
            }
        };

        sc.writeMe();



        SuperClassDeep scd = new SuperClassDeep() {
            @Override
            public void writeMe() {


            }
        };
        scd.writeMe();


    }

}
