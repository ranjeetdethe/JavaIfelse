class GreaterThan {
        public static void main(String[] args){
                int i= 8;

                if(i%2==0 && i<10){
                        System.out.println(i +"is even and less than 10");
                }
                else if(i%2==0 && i<10){
                        System.out.println(i +"is odd and less than 10");

                }
		else if(i%2!=0 && i<10){
                        System.out.println(i +"is odd and less than 10");
		}
		else {
			System.out.println(i +"odd and greater than 10");
        }
	}

}
