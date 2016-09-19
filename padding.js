import {repeat} from 'goog:goog.string';
import {makePadding} from 'goog:thirdpartyjs.util';

function leftPad (str, len) {
  return makePadding(str, len) + str;
}

function rightPad (str, len) {
  return str + makePadding(str, len);
}

export { leftPad, rightPad };
