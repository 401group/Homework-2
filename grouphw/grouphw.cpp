#include <iostream>
#include <fstream>
#include <string>
using namespace std;


int main()
{
    float input[100];
    float output[100];
    int numOfInputs = 0;
    float c, f;
    string line;

    char a;
    cout << "'y' to go through data on file, 'n' to enter data:";
    cin >> a;
    cout << endl;
    if (a == 'n')
    {
        while (true)
        {
            cout << "Enter temperature in Celsius to convert to Fahrenheit(Enter ctrl+z to stop):";
            cin >> c;
            f = (9.00 * c / 5.00) + 32.00;

            if (numOfInputs == 100)
            {
                break;
            }
            else if (c = cin.eof())
            {
                break;
            }
            else
            {
                input[numOfInputs] = c;
                output[numOfInputs] = f;
                ++numOfInputs;
            }
        }
        ofstream myfile("change.txt");
        if (myfile.is_open())
        {
            for (int i = 0; i < numOfInputs; i++)
            {
                myfile << "temperatures celsius " << input[i] << " converted to fahrenheit is " << output[i] << endl;
                cerr << "temperatures celsius " << input[i] << " converted to fahrenheit is " << output[i] << endl;
            }
            myfile.close();
        }
    }
    else if (a == 'y')
    {
        string filename;
        cout << "Please enter file name:";
        cin >> filename;
        ifstream infileA(filename);
        if (!infileA)
        {
            cerr << "Error, file could not be found";
        }
        if (infileA.is_open())
        {
            for (int n = 0; n < 100; n++)
            {
                infileA >> input[a];
            }

            ofstream fromfile("Fromtextfile");
            if (fromfile.is_open())
            {

                while (getline(infileA, line))
                {
                    fromfile << line << endl;
                }
            }
        }
    }
    return 0;
}