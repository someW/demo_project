适配器模式

步骤 1
为媒体播放器和更高级的媒体播放器创建接口。MediaPlayer & AdvancedMediaPlayer

步骤 2
创建实现了 AdvancedMediaPlayer 接口的实体类。VlcPlayer &Mp4Player

步骤 3
创建实现了 MediaPlayer 接口的适配器类。MediaAdapter

步骤 4
创建实现了 MediaPlayer 接口的实体类。AudioPlayer

步骤 5
使用 AudioPlayer 来播放不同类型的音频格式。AdapterPatternDemo



