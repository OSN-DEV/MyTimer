package jp.gr.java_conf.osndev.mytimer.service.model

/**
 * タイマー情報データクラス
 */
data class Time(
    val Id: Long,
    val GroupId: Long,
    val Name: String,
    val Time: String,
    val Priority: Int,
    val CreateAt: Long,
    val UpdateAt: Long
)
