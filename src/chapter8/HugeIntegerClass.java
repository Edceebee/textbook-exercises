package chapter8;

/* (Huge Integer Class) Create a class HugeInteger which uses a 40-element array of digits to
        store integers as large as 40 digits each. Provide methods parse, toString, add and subtract. Method
        parse should receive a String, extract each digit using method charAt and place the integer
        equivalent of each digit into the integer array. For comparing HugeInteger objects, provide the following
        methods: isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo
        and isLessThanOrEqualTo. Each of these is a predicate method that returns true if the relationship
        holds between the two HugeInteger objects and returns false if the relationship does not hold. Provide
        a predicate method isZero. If you feel ambitious, also provide methods multiply, divide and
        remainder. */



    class HugeInteger {

        private int[] value;

       public HugeInteger(String s) {
            super();
            parse(s);
        }

        public HugeInteger() {

        }

        public void parse(String s) {
            //read s and check if it's a valid array of x<=40 digits
        }

        public String toString() {
            //return the contents of int[] value as a readable String
            return null;
        }

        public HugeInteger add(HugeInteger hi) {
            //return the sum of this object and hi
            return null;
        }

        public HugeInteger subtract(HugeInteger hi) {
            //return the difference between this object and hi
            return null;
        }


    }
