import { useCallback } from "react";
import { useSelector } from "react-redux";

export function useSelect(select, ...args) {
  const selector = useCallback(
    state => select(state, ...args),
    // eslint-disable-next-line react-hooks/exhaustive-deps
    [select, ...args],
  );
  const value = useSelector(selector);

  return value;
}
