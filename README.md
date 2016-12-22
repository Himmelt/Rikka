#Rikka

1. 可编程对象 -> IScriptHandler
2. 可存储变量 -> IDataHandler
3. 可普通封装 -> Rikka

主要封装对象
```
Rikka -> Entity -> PlayerMP
                -> CNpc
      -> TileEntity
      -> Block
      -> World
IItemStack -> ItemStack
```

脚本执行顺序:
1. 新生成
   attach capability -> ScriptProvider::new -> ScriptHandler::new & Storage::new
   handler 初始化 -> 初始化 Object
        1. 禁用
        2. 语言默认
        3.

先静态,后开始构造,执行初始化区,执行构造,构造结束