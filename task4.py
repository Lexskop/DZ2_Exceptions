# Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

def try_to_print_empty_string():
    t_str = input('Введите текст -> ')
    print(t_str)
    if not t_str :
        print('Ваша строка пустая!')
        try_to_print_empty_string()

try_to_print_empty_string()