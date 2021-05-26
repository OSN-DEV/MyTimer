package jp.gr.java_conf.osndev.mytimer.service.model

/**
 * アプリケーション設定情報データクラス
 */
data class AppSetting(
    val LastGroupId: Long,
    val RingingTime: Int,
    val AlarmSound: String
)
