#include <iostream>
using namespace std;

void numword1(int);
void numword2(int);

int main()
{
  long unsigned int number,temp;
  int mult,i,digit,digits,last_two,hundred,thousand,lakh,crore;
  digits=last_two=hundred=thousand=lakh=crore=0;

  cout << "Enter a number(lesser than 99,99,99,999):";
  cin >> number;
  cout << endl << endl << number << endl << endl;

  if(number>999999999)
  {
    cout << "Number out of range!";
    return 0;
  }

  if(number==0)
  {
    cout << "Zero";
    return 0;
  }

  temp=number;

  digit=number%10;                    // Extracting last two digts
  last_two=digit;
  number=number/10;
  digit=number%10;
  last_two=(digit*10)+last_two;

  number=number/10;                  // Extract hundreds
  digit=number%10;
  hundred=digit;

  number=number/10;                  // Extract thousands
  digit=number%10;
  thousand=digit;
  number=number/10;
  digit=number%10;
  thousand=(digit*10)+thousand;

  number=number/10;                // Extract lakhs
  digit=number%10;
  lakh=digit;
  number=number/10;
  digit=number%10;
  lakh=(digit*10)+lakh;

  number=number/10;              // Extract crores
  digit=number%10;
  crore=digit;
  number=number/10;
  digit=number%10;
  crore=(digit*10)+crore;



  while(temp!=0)                // Calculate number of digits in the number
  {
    temp=temp/10;
    digits++;
  }

  cout << "The number in words is... " << endl << endl;

  // Printing the number in words

  if(digits>=8)
  {
    numword2(crore);
    cout<<"crores ";
  }
  if(digits>=6)
  {
    if(lakh!=0)
    {
      numword2(lakh);
      cout<<"lakh ";
    }
  }
  if(digits>=4)
  {
    if(thousand!=0)
    {
      numword2(thousand);
      cout<<"Thousand ";
    }
  }
  if(digits>=3)
  {
    if(hundred!=0)
    {
      numword2(hundred);
      cout<<"Hundred ";
    }
  }

  numword2(last_two);
  return 0;
}

void numword1(int num)
{
  switch(num)
  {
    case 0: break;
    case 1: cout<<"One ";
      break;
    case 2: cout<<"Two ";
      break;
    case 3: cout<<"Three ";
      break;
    case 4: cout<<"Four ";
      break;
    case 5: cout<<"Five ";
      break;
    case 6: cout<<"Six ";
      break;
    case 7: cout<<"Seven ";
      break;
    case 8: cout<<"Eight ";
      break;
    case 9: cout<<"Nine ";
      break;
    case 10: cout<<"Ten ";
      break;
    case 11: cout<<"Eleven ";
      break;
    case 12: cout<<"Twelve ";
      break;
    case 13: cout<<"Thirteen ";
      break;
    case 14: cout<<"Fourteen ";
      break;
    case 15: cout<<"Fifteen ";
      break;
    case 16: cout<<"Sixteen ";
      break;
    case 17: cout<<"Seventeen ";
      break;
    case 18: cout<<"Eighteen ";
      break;
    case 19: cout<<"Nineteen ";
      break;
  }
  return;
}

void numword2(int num)
{
  if(num>=90)
  {
    cout<<"Ninety ";
    numword1(num-90);
  }
  else if(num>=80)
  {
    cout<<"Eighty ";
    numword1(num-80);
  }
  else if(num>=70)
  {
    cout<<"Seventy ";
    numword1(num-70);
  }
  else if(num>=60)
  {
    cout<<"Sixty ";
    numword1(num-60);
  }
  else if(num>=50)
  {
    cout<<"Fifty ";
    numword1(num-50);
  }
  else if(num>=40)
  {
    cout<<"Fourty ";
    numword1(num-40);
  }
  else if(num>=30)
  {
    cout<<"Thirty ";
    numword1(num-30);
  }
  else if(num>=20)
  {
    cout<<"Twenty ";
    numword1(num-20);
  }
  else
    numword1(num);

  return;
}