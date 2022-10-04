#include <stdio.h>
void mergesort();
void merge ();
int main(){
  int a[40],n,i;
  printf("Name :-Sparsh Rawat sapid:-1000014310 \n");
  printf("enter size of array :");
  scanf("%d",&n);
  printf("enter elements :");
  for(i=0;i<n;i++)
  scanf("%d",&a[i]);
  mergesort(a,0,n-1);
  printf("sorted elements are :");
  for(i=0;i<n;i++)
  printf("%d\n",a[i]);
  return 0;
  }
void mergesort (int a[],int l, int r){int m;if(l<r){m =(l+r)/2;
  mergesort(a,l,m);
  mergesort(a,m+1,r);
  merge(a,l,m,r);
  }
  }
void merge(int a[],int first,int mid,int last){
  
  int b[50];
  int i,j,k;
  i=first;
  j=mid+1;
  k=first;
  while(i<=mid&&j<=last){
    if(a[i]<=a[j])
  b[k++]=a[i++];
else
  b[k++]=a[j++];
    }
  if(i>mid){
    while(j<=last)
      b[k++]=a[j++];
    }else{    
    while(i<=mid)
    b[k++]=a[i++];
    }
  for(i=first;i<=last;i++)
    a[i]=b[i];
  }