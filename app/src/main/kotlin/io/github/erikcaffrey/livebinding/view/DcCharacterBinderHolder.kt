package io.github.erikcaffrey.livebinding.view

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import io.github.erikcaffrey.livedata_databinding.BR
import io.github.erikcaffrey.livebinding.model.DcCharacter

class DcCharacterBinderHolder constructor(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun bind(dcCharacter: DcCharacter) {
        viewDataBinding.setVariable(BR.dcCharacter, dcCharacter)
        viewDataBinding.executePendingBindings()
    }
}
