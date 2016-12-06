class Equilibrium
{
    int equilibrium(int arr[])
    {
        int leftsum=0, rightsum=0;
        int n=arr.length;
        int total=0;

        for(int a=0 ;a<n; a++){
            total+=arr[a];
        }

        for(int a=0 ;a<n; a++){
            total-=arr[a];
            if(leftsum==total){
                System.out.println(a);
            }
            leftsum += arr[a];
        }
        
          return -1;
    }
    
    public static void main(String[] args)
    {
        Equilibrium equi = new Equilibrium();
        int arr[] = {-1, 3, -4, 5, 1, -6, 2, 1};
        equi.equilibrium(arr);
    }
}
