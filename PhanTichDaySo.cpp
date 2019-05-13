#include<stdio.h>
#include<conio.h>
int x[100], t[100], n;
int dem =0;

void khoitao(){
	printf("Nhap n: ");
	scanf("%d",&n);
	x[0]= 1;
	t[0]=0;
}
void xuat(int k){
	printf("\n %d = ", n);
	dem++;
	for(int i =1; i< k; i++){
	printf("%d + ", x[i]);
	}
	printf("%d", x[k]);
	
}
void phantich(int i){
	for(int j = x[i-1]; j<=((n-t[i-1])/2);j++){
		x[i]= j; 
		t[i]= t[i-1]+j;
		phantich(i+1);
	}	
	x[i] = n - t[i-1];
	xuat(i);
}
int main(){
	khoitao();
	phantich(1);
	printf("\nSo cach =  %d ", dem);
	getch();
}
