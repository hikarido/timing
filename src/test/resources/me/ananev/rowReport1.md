# Timing

| №   | time  | tasks      | desc                                                                                                                                                       |
|:----|:------|:-----------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1   | 11:00 | inbox      |                                                                                                                                                            |
| 2   | 11:10 | ID-1754    |                                                                                                                                                            |
| 3   | 12:00 | daily      | * ID-1748 перевел в тест <br/> * создать таску на добавление кода страны во все источники данных, уточни у Димы Попова детали. Инициатива исходила от него |
| 4   | 12:39 | daily      | * ID-1748 перевел в тест <br/> * создать таску на добавление кода страны во все источники данных, уточни у Димы Попова детали. Инициатива исходила от него |


# ID-1712
Падаем с

[2022-08-02T13:48:42.352Z] parsing WSDL...

[2022-08-02T13:48:42.352Z]

[2022-08-02T13:48:42.352Z]

[2022-08-02T13:48:42.352Z] [WARNING] InvalidRegex: Pattern value '(text|image|audio|video|application)/[a-zA-Z0-9-+.]*' is not a valid regular expression. The reported error was: ''-' is an invalid character range. Write '\-'.'.

[2022-08-02T13:48:42.352Z]   line 261 of file:/var/lib/jenkins/workspace/BACKEND-GEN/components/smev-adapter

[2022-08-02T13:48:42.352Z]

[2022-08-02T13:48:42.352Z] Exception in thread "main" java.lang.ExceptionInInitializerError

[2022-08-02T13:48:42.352Z] 	at com.sun.xml.bind.v2.runtime.reflect.opt.AccessorInjector.prepare(AccessorInjector.java:83)

[2022-08-02T13:48:42.352Z] 	at com.sun.xml.bind.v2.runtime.reflect.opt.OptimizedAccessorFactory.get(OptimizedAccessorFactory.java:176)

[2022-08-02T13:48:42.352Z] 	at com.sun.xml.bind.v2.runtime.reflect.Accessor$FieldReflection.optimize(Accessor.java:287)

[2022-08-02T13:48:42.352Z] 	at com.sun.xml.bind.v2.runtime.reflect.TransducedAccessor$CompositeTransducedAccessorImpl.<init>(TransducedAccessor.java:237)

[2022-08-02T13:48:42.352Z] 	at com.sun.xml.bind.v2.runtime.reflect.TransducedAccessor.get(TransducedAccessor.java:177)

[2022-08-02T13:48:42.352Z] 	at com.sun.xml.bind.v2.model.impl.RuntimeClassInfoImpl.calcTransducer(RuntimeClassInfoImpl.java:245)
