#include <iostream>

class infix
{
private:
    char inf[15], post[15], stk[15];
    int top, i, j;

public:
    infix()
    {
        top = -1;
    }
    void getdata();
    void push(char);
    char pop();
    int precedence(char);
    void conversion();
    void print();
};

void infix::getdata()
{
    std::cout << "Enter infix expression\n";
    std::cin >> inf;
}

void infix::push(char x)
{
    top++;
    stk[top] = x;
}

char infix::pop()
{
    char y = stk[top];
    top--;
    return y;
}

int infix::precedence(char k)
{
    if (k == '^')
        return 3;
    else if (k == '*' || k == '/')
        return 2;
    else if (k == '+' || k == '-')
        return 1;
    else
        return 0;
}

void infix::conversion()
{
    push('#');
    i = j = 0;
    char temp;
    while (inf[i] != '\0')
    {
        temp = inf[i];
        switch (temp)
        {
        case '(':
            push(temp);
            break;

        case ')':{
            char k = pop();
            while (k != '(')
            {
                post[j] = k;
                j++;
                k = pop();
            }
            break;}

        case '^':
        case '*':
        case '/':
        case '+':
        case '-':
            while (precedence(stk[top] >= precedence(temp)))
            {
                post[j] = pop();
                j++;
            }
            push(temp);
            break;
        default:
            post[j] = temp;
            j++;
            break;
        }
        i++;
    }

    while (top > 0)
    {
        post[j] = pop();
        j++;
    }

    post[j] = '\0';
}

void infix::print()
{
    std::cout << "Postfix expression";
    std::cout << post;
}

int main()
{
    infix i;
    i.getdata();
    i.conversion();
    i.print();

    return 0;
}