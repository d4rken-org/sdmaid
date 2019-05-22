#include <iostream>
using namespace std;

int main()
{
    int n;
    int lt;

    cout << "Enter a positive integer: ";
    cin >> n;
    cout << endl;
    cout << "Length of table: ";
    cin >> lt;
	cout << endl;

    for (int i = 1; i <= lt; ++i) {
        cout << n << " * " << i << " = " << n * i << endl;
    }

    return 0;
}