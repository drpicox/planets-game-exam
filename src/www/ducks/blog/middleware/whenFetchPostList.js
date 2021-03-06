import api from "../../../lib/api";
import { setPost } from "../actions/setPost";

export async function whenFetchPostList(store, action) {
  const { list } = await api.get("/api/v1/posts");
  list.forEach(p => store.dispatch(setPost(p)));
}
