export function convertHumanIdIntoTestId(humanId) {
  return humanId.toLowerCase().replace(/\s+/g, "-");
}
