class zero{
public static void main(String[] args)
{
int n[]={5,0,2,8,0,0,7,1};
for(int i=0,j=0;j<n.length;j++)
{
    if(n[j]==0) {
       n[j]=n[i];
       n[i]=0;
        i++;}


}
for(int i=0;i<8;i++)
{
  System.out.println(n[i]);
}
}
}
