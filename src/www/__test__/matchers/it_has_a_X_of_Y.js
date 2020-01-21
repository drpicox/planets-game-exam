import { getByTestId } from "@testing-library/dom";
import { AbstractMatcher } from "./";
import { convertHumanIdIntoTestId } from "./helpers";

export default class extends AbstractMatcher {
  constructor() {
    super(/it has a _([^_]+)_ of _([^_]+)_/i);
  }

  interpretMatch([, humanId, text], _, { wantFor }) {
    const it = wantFor("it");
    const testId = convertHumanIdIntoTestId(humanId);
    const element = getByTestId(it, testId);
    expect(element).toHaveTextContent(text);
  }
}
