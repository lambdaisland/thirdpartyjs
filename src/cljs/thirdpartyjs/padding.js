goog.provide('thirdpartyjs.padding');
goog.require('goog.string');

thirdpartyjs.padding.leftPad = function (str, len) {
  var string = String(str)
  var padLen = len - string.length;

  if (padLen <= 0) {
    return str;
  }

  return goog.string.repeat(' ', padLen) + string;
}
