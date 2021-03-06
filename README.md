# DesignPattern

## 学习计划

每天4个设计模式的样例代码实现，后面的设计模式由于没有看过可能速度会降低

## GRASP九大原则

### 控制器

### 创建者

### 信息专家

### 低耦合

### 高内聚

### 多态

#### 解决问题

如何处理（代码）基于类型的选择？如何创建可插拔的软件构件？

#### 解决方案

当相关选择或行为随类型（类）有所不同时，使用多态操作为变化的行为类型分配至职责。

**推论：** 不要测试对象的类型，也不要使用条件逻辑ifelse语句来执行基于类型的不同选择。

### 纯虚构（pure fabrication）

#### 解决问题

当不想违背高内聚和低耦合或其他目标，但是基于专家模式的方案又不合适时（违背了前面所说的目标），什么对象应该承担这一职责？

#### 解决方案

虚构一个类，为这个人为制造的类分配一组高内聚的职责，该类并不代表问题领域的概念。它是用来维护高内聚和低耦合的性质的。

#### 例子

- 比如项目开发中的DAO层的类（持久性存储的类）就是一个虚构的类，是通过纯虚构的指导思想而被引入的类。

- 适配器模式，策略模式，命令模式都是纯虚构的例子。（事实上，所有其他设计模式都是纯虚构的）

### 间接性

#### 解决问题

为了避免两个或多个事务之间直接耦合，耦合过于复杂，应该如何分配职责？如何使对象解耦合，以支持低耦合并提高复用性潜力？

#### 解决方案

将职责分配给中介对象，避免它们之间的直接耦合。

#### 例子

适配器模式，中介者模式，以及DAO的设计都有间接性的思想。

### 防止变异（PV）

#### 解决问题

如何设计对象、子系统和系统，使其内部的变化或不稳定性不会对其他元素产生不良影响？

#### 解决方案

识别预计变化或不稳定之处，分配职责用以在这些变化之外创建稳定接口。（将可能出问题（变化）的地方想办法加中间层封装起来。）

#### 例子

大部分设计原则和模式都是防止变异的机制。包括多态、接口、间接性、数据封装、大部分GoF设计模式等。以及反射机制。

他基本等同于信息隐藏和开闭原则。

## **六大原则**

### 依赖倒置原则

### 开闭原则

### 迪米特法则

### 单一职责原则

让一个类发生修改的原因只能有一个

### 里氏替换法则

### 接口隔离原则

不同的功能需要分不同的接口，接口中不能有无用的方法。当出现无用的方法时，应当对接口进行拆分，是这个原则的指导思想。

## 2019/10/7更新 按照书上章节顺序

### 单例模式

> 功能：创建对象

特点：
- 私有化构造函数
- 一个私有静态final的Field（singleton对象自身）用于保存唯一的实例化对象
- 一个getInstance()函数用于获取实例

### 工厂方法模式

用于生产复杂对象（产品对象）

#### 简单工厂模式

去掉了工厂方法模式中的抽象工厂类

#### 多工厂模式

该模式中，所有的具体产品类都要有一个具体工厂类负责生产，但是意义有些不明，并且这个和抽象工厂模式有些类似（但是从书上看内容还挺不一样的）

#### 懒加载工厂模式

该模式中，工厂会使用一个Map缓存生产的产品，当要求生产某一个具体产品类时，如果已经生产过，则直接从Map中返回

### 抽象工厂模式

该模式用于复杂场景：产品类有n个产品族，m个产品等级（产品类型），在抽象工厂类中，要有n个生产函数，并且有m个实现工厂类负责生产同一个产品类型（产品等级）的所有产品族的产品

### 模板方法模式

### 遗留问题

对于工厂方法模式和抽象工厂模式，两个模式的通用类图是几乎完全一致的，不知道这两种模式之间有何区别。

### 问题解答

抽象工厂模式对产品类有两层的抽象，工厂方法模式对产品类有一层的抽象。因此抽象工厂可以实现对更加复杂的产品类进行生产。

## 2019/10/8更新

### 建造者模式

建造者模式设计模式之禅与图解设计模式两本书上有较大的差异，前者在建造者模式中结合了模板方法模式，但它加入具体产品类的原因我不太清楚，将具体产品类这一抽象去除后，得到了与图解设计模式中类似的建造者模式类图与代码。

**补充**： 如果Director类下的Builder是业务逻辑类的话，使用少一层抽象的建造者模式即可。如果Builder类的任务是构建不同的产品类，则需要使用三层抽象的建造者模式。

建造者模式适用于关注对象方法执行顺序的场景，即不同的执行顺序（或对象的装配顺序）会带来不同的效果，与模板方法模式配合使用效果很好。

### 代理模式

代理模式在各式框架中的使用都很多，最为重要的是其中的动态代理，用于实现AOP编程。原始的动态代理只能代理实现了接口的类，即接口的实现类，而使用CGLIB字节码增强等方法可以去除此限制。

代理模式为什么是采用实现同一个接口，而不是继承需要代理的类呢（实现同一个接口也能做到对外界封装的代理，因为面向接口编程，使用的是接口，并不知道使用了代理（如果用了工厂方法模式的话））

#### 动态代理模式

动态代理模式是代理模式中的重头戏，在使用过程中，动态代理与被代理的业务类完全隔离。

**动态代理的实现过程为：**

1. 编写一个InvocationHandler的实现类，其中包含一个Aspect类，该切面类实现IAdvice接口（即增强方法）。

2. 通过Proxy.newProxyInstance方法生成一个业务类的代理类，并使用接口接收该类。

3. 实际使用过程中，可以为业务类实现一个工厂方法模式，在工厂方法中返回一个增强过的代理类，或是使用一个DynamicProxy工厂类封装返回动态代理类的过程（使用泛型方法避免强转），更可以实现一个DynamicProxy工厂类的具体实现类专门生产对应业务类的代理。

4. 但是个人认为使用工厂方法直接返回一个业务类的代理更加好。

AOP编程可以以一种（继承之外的）很好的方式实现代码重用与添加功能。

### 遗留问题

普通的代理模式只是对被代理类（真是对象）的一层封装，感觉意义不大而且和适配器模式有点像？

为什么不通过创建一个被代理类的子类的方式实现代理，AOP编程和增强呢。

### 问题解答

普通的代理模式有什么应用？ ---当需要代理的类较少时（并且有抽象的接口），可以使用普通的代理模式实现代理，但是当需要代理的类多的时候，每个类都需要一个代理类，会导致类数量的膨胀，此时应该用动态代理。其实一开始就用动态代理即可。

但是这样的普通的代理模式，基本上和适配器模式是重复的。

为什么不用继承的方式实现增强？ ---见装饰模式中的说明。简单来说，继承实现增强灵活性低，并且随着需求的增长，子类的增长可能不受控制，并且如果需要增强的类有子类的话，使用继承增强不能兼容。最大的问题就是灵活性低了。

## 2019/10/9 更新

### 原型模式

该模式通过clone的方法产生一个新对象,由于克隆是内存二进制操作,因此新建对象的效率比较高.但是不会执行构造函数.

clone()函数在使用的时候需要注意一些事项：

1. 注意深拷贝与浅拷贝的区别。当没有可变对象引用（即不可变引用或是基本类型String也算），直接调用super.clone()就可以完成拷贝，否则就是浅拷贝，引用指向的是同一个对象，这种情况下，需要分别调用clone()函数进行拷贝。

2. 深拷贝和浅拷贝不要混着写，分开写。

3. 实现了cloneable接口的类不能有final的成员变量。

原型模式可以从一个已有的对象上复制出拥有相同信息的克隆对象，在进行一些调整就可以成为个性化的对象，用于新建一个对象十分繁杂，而克隆可以直接获得所有共有信息的场景下，以及（在这种场景下）用于解决线程安全问题的一个模式。

### 中介者模式

中介者模式通过引入一个控制类（中介类），负责控制不同对象间的依赖关系，适用于多个类间复杂依赖关系的场景，以及（在框架中）虽然是1对1的依赖关系，但是依赖关系十分复杂的场景。

中介者模式是一个致力于解耦的模式，用于对无法提取出抽象类，但又需要解耦的场景。通过一个中介者，各个类可以专注于自己的业务逻辑，而将所有依赖于其他类的业务逻辑全部交给中介者处理。

在实际使用中，中介者就像是一个控制中心，负责协调各个类间的联系（依赖），组织各个类工作。因此将来看到一个控制中心一样的类出现在了设计结构中时，有可能是使用了中介者模式。

因为有可能一个业务类本身就有控制中心的功能，也可以在需要将依赖关系简化为星型拓扑结构时引入一个控制中心（中介者）。

## 2019/10/10更新

### 命令模式

命令模式在我看来是中介者模式的一种扩展，用于有请求或命令等（并且需要对请求或命令封装为对象时）的一种模式。因此作用是对请求（或命令）的发起者与实际执行对象之间依赖的解耦。

在命令模式中，请求者和执行者之前还是会有一定的联系。即请求者（高层模块）需要在new Command类的时候传入需要的Receiver类（执行者类）

如果要完全解耦，有两种办法。

1. 在Command类的基类中直接依赖所有的执行者类

2. 在Command类的构造函数中实现默认的执行者类依赖（可能需要是数组）

注意:

* 不能用中间层的Invoker类去为Command类注入依赖的执行者类，因为会破坏Command类的抽象，让Invoker依赖Command类的具体实现类，从而无法使用多态的性质。

* Command的实现类可能会膨胀的很大，因为每一个指令都被封装为了一个具体实现类。书中说可以通过模板方法模式来减轻这个问题，但是我还没有具体的体会。

## 2019/10/13更新

### 责任链模式

责任链模式在我看来是对if else语句的抽象，将if else语句换成了处理类链，可以通过扩展实现需求变更，符合开闭原则，并且每个处理类只负责处理一种情况，符合单一职责原则，是一个很好的用于抽象和提高扩展性的模式。

对于它的使用则接近于递归，一直传递到没有下一个处理类或有处理类能够处理该请求为止开始返回。

一般在使用时，需要对责任链的设置再进行一层封装，从而达到对Client类这种高层调用模块隐藏责任链的效果，Client看到的是一个Handler，使用该Handler处理请求，但实际上是由一个Handler链在进行处理。

当对请求进行处理并返回结果时可以使用该模式，因此该模式封装了Request和Response代表需要处理的请求和处理的响应，同时该模式也可以作为一种需求变更时的补救模式，当需求增加了一种情况时，可以考虑引入责任链模式，对请求进行链式的处理。至于需不需要再封装一层责任链的设置可以再考虑。

## 2019/10/14更新

### 装饰模式

装饰模式可以看做是静态代理模式的一种增强（实际上和静态代理模式几乎是一样的）。并且可以看到，如果通过继承的方式对类功能进行扩展，当扩展的需求增多的时候（有些时候扩展3个功能，有时候4个），使用继承的方法会导致子类快速的增加，并且子类与父类强耦合，扩展功能的灵活性也不高。并且假如该类也有其他子类的情况下，子类的扩展也不好做。（见代码中ConcreteComponent和它的子类）

通过装饰模式，上述问题都能够得到解决。首先，解耦了增加的功能（装饰类）和实际的类（业务类），两者只需要实现共同的接口，就可以让接口指向任意一个类，从而在使用上隐藏装饰类的存在。同时装饰类有着高灵活性，将每个需要的功能写一个装饰类，需要的时候就对具体业务类进行装饰，不需要就不装饰即可。不会因为扩展功能的增加，子类就不受控制的增长。

动态代理也可以实现增强功能。但是感觉上装饰器模式要比动态代理简单一些，并且不依赖与java实现。

### 遗留问题

对于抽象的装饰器类的存在价值依旧不清楚，现在看来作用只有提取了重复代码（每个子类都依赖于实际业务类Component类）

## 2019/10/16更新

### 策略模式

> 模块间解耦

策略模式是一个相对简单的模式，它的作用是（当一个功能有很多算法实现的时候）对一个算法族（多个相同功能不同实现的算法）的封装，并且使用了一个Context类，将高层调用模块和Strategy类相分隔。**封装了可能的变化。**

这个模式是对类继承和多态，以及面向接口编程了很好（也很简单）的应用。**它与代理模式，装饰模式都有相似的地方。它们总结起来，都是在做底层实现和高层模块的解耦和封装，封装底层模块可能的变化，提高可扩展性，以及做类方法功能增强。这个很重要。**

#### 补充

策略模式可以通过整合一个用于生产策略的策略工厂来使系统更加灵活。

策略模式是一种**纯虚化**概念的体现，通过将行为提取到外部变为一个虚构的类（不在领域模型中出现的类），再通过组合的形式获得这个新的类的行为。在工厂模式中，也体现了这个特点，将new操作提取到外部去。

## 2019/10/17更新

### 适配器模式

> 功能： 解决对象间依赖

适配器模式是一个非常好的补救性模式，当项目运行后，出现需求变动，从而需要对现有运行中的接口进行变动时，可以考虑使用适配器模式。

适配器模式本身并不复杂，它用于将两个没有关系的类联系在一起，让高层模块能像使用正常的接口一样使用新加入的类（这个类可以实现完全不同的接口），打个比方的话，就是要把两块缺口不匹配的拼图拼在一起的时候，在中间额外加一块拼图。

适配器模式分为两种，**类适配器**和**对象适配器**，类适配器使用继承的方式继承需要做适配的类（实现类），对象适配器使用组合的方式（依赖）关联需要适配的类。在应用中，由于对象适配器更加灵活，因此使用的也更多。

适配器模式的补救功能很强，但是要求系统本身必须遵守依赖倒置原则和里式替换原则（面向接口编程）进行开发才能发挥出最大的作用。它的好处很多，提高类的复用度，灵活性非常好，增加了类的透明性（被适配的类对高层模块完全是隐藏的）

## 2019/10/21更新

### 迭代器模式

根据书上所说，迭代器模式在现在由于已经完全融入了语言的基本实现中，因此单独的迭代器模式已经没落了。在java中，jdk提供了Iterable和Iterator接口，分别对应抽象容器和抽象迭代器，两者都有非常多的实现类容器和对应的迭代器，一般而言，不需要我们在项目中再自己编写迭代器模式，直接使用jdk提供的容器类就可以解决问题。

迭代器模式是为容器服务的。在Iterator接口中，定义了一些函数，其中最重要的是hasNext()和next()，以及一个可以不实现的remove()方法。对于三个方法的逻辑，迭代器模式代码中的写法是最适合于代码的写法，不论是next还是remove，都需要以hasNext为前提。

现在已经不太需要写迭代器模式了，在简单的应用里面自己编写迭代器模式甚至可能使项目复杂化，使用jdk提供的容器类就能解决绝大部分问题。

## 2019/10/23更新

### 观察者模式（订阅/发布模式）

这个模式在项目中的使用十分的频繁，我也已经用了好几次这个模式和这个模式的变种了。在这里总结一下使用这个模式的场景以及我之前使用时的一些错误。

这个模式适用于当出现一对多的对象依赖的时候，或是当一个事件发生的时候需要触发多个事件时，需要使用到触发机制的时候，一堆对象需要根据某个对象的变化做出相应的处理和变化时（关联行为场景）都可以使用这个模式。此外书上还提到了事件多级触发场景（使用观察者广播链）以及跨系统的消息交换。

这个模式当中,被观察者依赖所有观察对象,保存一个观察对象list,在具体的观察者里面,是不需要依赖被观察者的,之前我的实现中这里有问题.但是update参数需要传入被观察对象,这是**为了实现观察者广播链**而需要的参数,当一个对象既是观察者,也是观察对象的时候,需要使用到这个参数(目前还没有体会).

参考:
> https://blog.csdn.net/u012250875/article/details/77747878

这个模式实现了很高的扩展性，以及灵活性（关联行为可以被简单的删除和添加），但是在使用的时候也有需要注意的地方：

1. 使用广播链的时候，注意最好不要超过两层的消息传递，否则系统的逻辑会很复杂，并且难以维护。

2. 当观察者的update()函数需要执行很长的时间时，效率会比较底下，此时有两种解决方法，一种是使用异步的方法，一种是使用缓存的方法（同步的）。当使用异步处理的时候要注意线程安全性等问题。

3. 被观察者尽量自己做主，只在需要通知观察者的方法中通知观察者，是否通知由被观察者决定，在代码实现中会给出一种参考实现。

**进阶**EJB3（Enterprise JavaBean）是一个观察者模式的升级版，消息队列也是一个观察模式的应用，可以去看看！

## 2019/10/27更新

### 门面模式

> 功能： 模块间解耦（解决模块间依赖）、控制器

这个模式也是一个封装和解耦功能的模式，类似于中介者模式，当子系统的逻辑相当复杂时，可以通过设计一个门面类，将高层调用模块与子系统完全分离，使得子系统可以随意改动而不会影响高层模块的调用。

这个模式和适配器模式也有相似之处，在适配器模式中，被适配的是一个类，而在门面模式（外观模式）中，被适配的是一个子系统。

与适配器模式的对比：

- 适配器模式需要实现所有被适配的类的全部接口。而门面模式的门面类只需要提供需要被使用的子系统的类

- 适配器模式的被适配对象是类，门面模式的被适配对象是子系统。

门面模式适用于当子系统特别复杂，或是子系统相对独立，需要为外界提供一个（或多个）访问的接口。同时该模式可以将子系统与高层模块分离，因此如果技术人员的水平较低，通过该模式可以将烂代码对系统的影响降低，将影响封装在子系统里。

门面模式可以在不增加高层调用模块和子系统的依赖的前提下，将想要暴露出去的子系统方法都通过门面类暴露出去，从这个角度来考虑门面模式是相当好用。

门面模式提高了灵活性，安全性（门面模式可以限制外界对子系统的访问），并且减少高层模块与子系统之间的相互依赖。

这个模式举了一个邮局和送信的例子，邮局是门面。在讲的时候，提到门面类不参与子系统的业务逻辑，如果子系统内部有复杂的类依赖关系，可以考虑再通过其他模式（比如中介者模式）来解决，书中也是使用的一个封装类context来封装子系统类之间的依赖关系（这个应该就是中介者模式的应用了）。但是不能在门面类里面加业务逻辑，这是破坏了单一职责和子系统的封装性的很不好的行为。使得子系统要依赖于门面类才能正常运作。

但是同时，如果使用书中建议的方法，则会给子系统中引入一个类，而如果在门面类中直接写简单的业务逻辑，可能就可以使子系统整体简单一些，同时并不会给子系统的封装性带来太大的破坏，扩展性灵活性安全性等也没多大影响。而且子系统依赖于门面类才能给高层模块使用也没什么问题嘛。我认为两种方法都可以考虑使用。即我认为加个封装类或是中介者类，本身该类就可以用来作为门面，再多一个门面类只依赖于中介者类的话，这个门面类有价值吗。

当出现以下两种情况的时候，可以考虑为一个子系统分配多个门面类：

1. 门面类非常庞大，此时可以按照功能对门面类进行划分
2. 需要对外界访问子系统进行某种限制，比如对于某些类可以使用全部的子系统功能，但对于另外一些类只能使用部分子系统功能时。

注意：

- 门面模式应当使用单例模式，在整个项目中，使用唯一一个门面类就可以了，没必要很多个门面类对象。

### 遗留问题

书中虽然说了门面类不能参与子系统的业务逻辑，但是让门面类参与进去可以有效的减少子系统的复杂度，减少一个中介类的产生，而且书中邮局和写信的例子就将送信的相关步骤全部放进了邮局这个门面类中，让门面类参与了业务逻辑。

## 2019/11/4更新

经过了一波赶ddl的日子之后，终于又有时间看设计模式了。因此断了一段时间的设计模式又可以开始了，但是可能过不了多久就又要进入赶ddl的日子了，赶紧再看几个。

### 备忘录模式（备份模式）

备份模式可以为我们提供一种备份和回滚的操作。根据单一职责原则以及迪米特原则，在实现时，将备份操作单独写了一个备份类，并为备份类写了一个备份管理类。当需要备份的对象是一个多状态的对象，并且需要存储多个备份的时候会很有用，逻辑清晰并且符合设计原则。

在使用备份模式的时候，注意备份模式的效率问题和生命周期问题，不要发生内存泄漏，不要频繁的创建备份。

备份模式的使用场景是所有需要提供回滚操作的场景，以及需要保存和恢复数据的场景。比如数据库连接的事务管理，就需要使用备份模式。（**但是不知道怎么用的。。**）同时，在需要监控的场景中，可以对主业务的逻辑类进行备份，在另外一个线程中进行分析监控。（估计暂时不会有这种需求）

java反射机制真强。私有的变量看来通过反射应该也是无法获取的。通过反射获取fieldValue的方法是获取field的getter/setter方法，再调用来实现的。因此没有提供getter方法的私有成员是无法通过反射访问到的（应该是）

## 2019/12/17更新

### 组合模式

组合模式在平时的使用并不是很多，本身也不是很复杂，因此不做过多的记录（不提供Client了）。

当需要将多个相似对象组织成一个树形的结构时，可以使用组合模式。

在组合模式中，提供了Leaf和Composite两种节点，即叶子节点和中间节点，也可以考虑将叶子节点和中间节点合并为同一个节点，没有孩子节点的节点就是叶子节点。这样在实现中更加泛化，不再需要区分叶子节点和中间节点。

感觉上notion在整体上就体现了组合模式，所有的文件同时也是目录。

> 设计模式之禅
>
>图解设计模式
