package ARRAYS_CHAPTER_1;

public class copyelements1to2 {
    public static void main(String[] args) {
		int a1[]= {11,22,5,44,7,9,6,3};
		int a2[]=new int[a1.length];
		
		for(int i=0;i<a1.length;i++) {
			a2[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			System.out.print(a2[i]+"  ");
		}
	}
}
