
    class A{
        public A(){}
    }
    class B extends A{
        public B(){
            super();
        }
    }
    class C extends B{
        public C(){
            super();
        }
    }
    class D extends A{
        protected int d = 1;
        public D(int x){
            super();
            this.d = x;
        }
        public D(){}
    }

    class E extends D{
        public  E(){
            super();
        }
    }

    class F extends D{
        public F(){
            super();
        }
    }

    class ABCDEF {
        public static void main(String[] args) {
            //indiquez si les les affectations suivantes sont correctes:
            A a = new A();
            B b = new B();
            C c = new C();
            D d = new D();
            E e = new E();
            F f = new F();

            a=b; //correct
            b=a; //incorrect A n'est pas un B, pas de conversion implicite vers un enfant
            a=(A) b; //correct
            a=null; //correct
            null=a; //incorrect null n'est pas une variable, on ne peut pas lui affecter quelque chose
            a=d; //correct
            b=d; //incorrect D hérite de A, pas de B — aucun lien entre D et B
            a=e; //correct
            d=e; //correct

            A[] as = new A[10];
            as[0] = new A();
            as[1] = new B();
            as[2] = new D(2);
            as[3] = new E();
            as[4] = new C();
            as[5] = new D(4);
            as[6] = new B();

            rechercher(as);
            additionner(as);
        }

        private static void rechercher(A[] as) {
            int instanceB = 0;
            for (A a : as) {
                if (a instanceof B) {
                    instanceB++;
                }
            }
            System.out.println("Nombre d'instances de B : " + instanceB);
        }

        private static void additionner(A[] as) {
            int sommeD = 0;
            for (A a : as) {
                if (a instanceof D) {
                    sommeD += ((D) a).d;
                }
            }
            System.out.println("Somme des variables d : " + sommeD);
        }
    }

