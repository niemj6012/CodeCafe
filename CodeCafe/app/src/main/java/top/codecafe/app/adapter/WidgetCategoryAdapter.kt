package top.codecafe.app.adapter;

import android.support.v7.widget.RecyclerView
import top.codecafe.app.R
import top.codecafe.app.bean.WidgetCategory
import top.codecafe.app.ui.base.BaseRecyclerAdapter
import top.codecafe.app.ui.base.RecyclerHolder
import top.codecafe.app.utils.px2sp

/**
 * UI控件库界面适配器
 *
 * @author kymjs (http://www.kymjs.com/) on 8/27/15.
 */
public class WidgetCategoryAdapter(view: RecyclerView, datas: Collection<WidgetCategory>?)
: BaseRecyclerAdapter<WidgetCategory>(view: RecyclerView, datas: Collection<WidgetCategory>?,
        R.layout.item_recycler_widget_category) {

    override fun convert(holder: RecyclerHolder?, item: WidgetCategory?, isScrolling: Boolean) {
        if (item?.size == 1) {
            holder?.itemView?.setMinimumHeight(cxt.px2sp(240f))
        } else {
            holder?.itemView?.setMinimumHeight(0)
        }
        holder?.setText(R.id.name, item?.name)
    }
}