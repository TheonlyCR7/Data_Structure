#include <iostream>
#include "swap.h"
using namespace std;

bool swap(int a, int b) {

	int mid = a;
	a = b;
	b = mid;
	return true;
}

