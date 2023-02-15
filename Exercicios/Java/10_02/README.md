# INTRODUÇÃO AO SPRING

## CONCEITO DE INTERFACES E CLASSES ABSTRATAS

### O que é uma interface?

#### É um tipo especial de classe que define uma série de ações que outras classes deverão implementar. Ela fornece uma garantia de que as classes que as classes que a implementam irão fornecer ações  específicas, mas permite que cada classe as implemente de forma individual.

### O que é uma classe abstrata?

#### Classe abstrata é uma classe que não pode ser instanciada diretamente. Ou seja, você não pode criar obejtos a partir dela.

#### INSTANCIAR -> CRIAR OBJETOS!

### En vez disso, as classes abstratas servem como modelos para outras classes que podem herdar seus atributos e comportamentos.

### Diferenças entre classes abstratas e interfaces

#### 1. Herança única versus Múltipla Implementação. Uma classe pode herdar apenas de uma classe "mãe", mas pode implementar várias interfaces.

#### Isso significa que as interfaces permitem que uma classe implemente vários comportamentos, enquanto as classes abstratas só permitem herança de um comportamento.

### Métodos abstratos. Ambas as classes abstratas e as interfaces podem conter métodos abstratos. No entanto as classes abstratas também podem conter métodos concretos com implementação de código. Enquanto as interfaces só podem conter métodos abstratos.

### Pra que servem as classes abstratas e interfaces?

### As classes abstratas são usadas para fornecer uma estrutura geral pra outras classes.

#### As interfaces são usadas para garantir que certos comportamentos sejam implementados em várias classes.

#### As classes abstratas podem fornecer implementações de código para comportamentos padrão que podem ser herdados e usados por classes filhas.

#### As interfaces não fornecem implementações de código, apenas definem os COMPORTAMENTOS que devems