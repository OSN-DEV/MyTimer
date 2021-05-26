package jp.gr.java_conf.osndev.mytimer.service.model

/**
 * タイマーグループ情報データクラス
 */
data class Group (
    val Id: Long,           // id
    val Name: String,       // グループ名
    val CreateAt: Long,     // 作成日時
    val UpdateAt: Long      // 更新日時
)