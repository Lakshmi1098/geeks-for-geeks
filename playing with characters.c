int main() 
{
char a,b[10],c[10];
    scanf("%c",&a);
  scanf("%s",b);
    scanf("\n");
  scanf("%[^\n]%*c",c);
    
    printf("%c\n", a);
    printf("%s\n", b);
    printf("%s", c);
    return 0;
}
