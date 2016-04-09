package org.mystic

import org.mystic.Utils.DVector

case class Stats[T <% Double](values: DVector[Double]) {

  def normalise = {
    val range = stats.max - stats.min
    values.map(x => (x - stats.min) / range)
  }

  case class _Stats(var min: Double, var max: Double, var sum: Double, var sumSquare: Double)

  val stats = {
    val _stats = new _Stats(Double.MaxValue, Double.MinValue, 0d, 0d)

    values.foreach(x => {
      _stats.min = Math.min(x, _stats.min)
      _stats.max = Math.max(x, _stats.max)
      _stats.sum += x
      _stats.sumSquare += x * x
    })

    lazy val mean = _stats.sum / values.size
    lazy val min = _stats.min
    lazy val max = _stats.max

    _stats
  }




}