sealed class NetworkResult
data class Success(val result: String) : NetworkResult()
data  class Failure(val error: Error) : NetworkResult()
/*

viewModel.data.observe(this, Observer<NetworkResult>{data -> data ?: return@Observer

when(data){
    is Success -> showResult(data.result)
    is Failure -> showError(data.error)
}})
*/

        //And for Recycler view for viewHolder