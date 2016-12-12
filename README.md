#Rikka

脚本执行顺序:
1. 新生成
   attach capability -> ScriptProvider::new -> ScriptHandler::new & Storage::new
   handler 初始化 -> 初始化 Object
        1. 禁用
        2. 语言默认
        3.

先静态,后开始构造,执行初始化区,执行构造,构造结束